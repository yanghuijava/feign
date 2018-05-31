package feign;

import java.lang.reflect.Type;

public interface ResponseInterceptor {

  byte[] intercept(Response response, Type type) throws Exception;

}
