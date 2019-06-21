package daggerok.config.props;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
// @Component // 2.2.0
@ConfigurationProperties(prefix = "file-items-rest-service")
public class FileItemsRestServiceProps {
  private String url;
}
