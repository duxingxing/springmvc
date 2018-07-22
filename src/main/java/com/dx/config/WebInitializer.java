package com.dx.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import javax.servlet.ServletRegistration.Dynamic;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;


/**
 * Created by 杜兴 on 2018/7/22.
 */
    public class WebInitializer implements WebApplicationInitializer {

        public void onStartup(ServletContext servletContext) throws ServletException {
            AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
            ctx.register(MyMvcConfig.class);
            ctx.setServletContext(servletContext);
            Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
            servlet.addMapping("/");
            servlet.setLoadOnStartup(1);
        }
    }
