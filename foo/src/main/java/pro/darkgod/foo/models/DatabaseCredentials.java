package pro.darkgod.foo.models;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class DatabaseCredentials {
  private String host;
  private Integer port;
  private String externalController;
}