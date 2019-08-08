package micronaut.openapi.parse.javadoc;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MyController {

  /**
   * This is a
   * multiline description
   * of the API
   * @param testParam This is a
   *                  multiline description
   *                  of the parameter
   * @return This is a
   *     multiline description
   *     of the return value
   */
  @Get("/{testParam}")
  public Map<String, String> index(String testParam) {
    Map<String, String> map = new HashMap<>();
    map.put("value", testParam);
    return map;
  }
}
