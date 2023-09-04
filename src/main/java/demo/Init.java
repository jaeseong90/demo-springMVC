package demo;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Init extends AbstractAnnotationConfigDispatcherServletInitializer {

    // Root application context 설정
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    // DispatcherServlet application context 설정
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    // DispatcherServlet 매핑 설정
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }


}
