package com.api.parkingcontrol.configs.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration //classe de configuration do Spring
//@EnableWebSecurity //uso essa anotação pra que as configurações default do Spring não atrapalhem as minhas configurações, é como se eu zerasse as configs do SpringSecurit
public class WebSecurityConfig extends WebSecurityConfigurerAdapter { //classe de config e irei usar alguns métodos dela

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        //nesse caso eu permito todas as autenticações mesmo tendo o SpringSecurity mas alguns métodos ainda n funcionam
//        http.httpBasic().and().authorizeRequests().anyRequest().permitAll();

        //nesse caso somente autenticados
        http.httpBasic().and().authorizeRequests().anyRequest().authenticated().and()//.and serve para unir as configs com outras mais
                .csrf().disable();//essa última parte eu usei pra desabilitar essa função de segurança do SpringSecurity p que eu possa usar todos os métodos CRUD
                // o CSRF serve para proteger a aplicação contra tentativas maliciósas de modificações na conta do usuário logado
                //por isso alguns métodos que modificam já vem com o CSRF habilitado
    }

    @Override //método para settar de forma padrão a autentição em memória
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication() //será em memória
                .withUser("jesse") //passo um usuário
                .password("12345") //passo uma senha
                .roles("ADMIN"); //passo uma role ou papel e.g. "ADMIN USER", "ADMIN USER STUDENT" é preciso definir pois senão o java manda um null pointer exception
                //depois dessas configs o Spring Security não gera mais uma password
    }
}
