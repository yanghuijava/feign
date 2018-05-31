package feign;

public interface ResponseInterceptor {
  
  void intercept(Response response);

}
