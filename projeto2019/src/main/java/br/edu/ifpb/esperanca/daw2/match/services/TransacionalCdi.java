package br.edu.ifpb.esperanca.daw2.match.services;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.interceptor.InterceptorBinding;

@InterceptorBinding
@Retention(RetentionPolicy.RUNTIME)
public @interface TransacionalCdi {

}
