package device.model;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Builder(toBuilder = true)
@Value
@RequiredArgsConstructor
public class Mouse {
  private final Long deviceId;
  private final int color;
}
