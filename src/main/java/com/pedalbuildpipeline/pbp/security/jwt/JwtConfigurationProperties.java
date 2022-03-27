package com.pedalbuildpipeline.pbp.security.jwt;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.concurrent.TimeUnit;

@Getter
@Setter
public class JwtConfigurationProperties {
  @ToString.Exclude @NotBlank
  private String base64Secret;

  @NotNull private Long tokenValidMinutes = TimeUnit.HOURS.toMinutes(4);
}
