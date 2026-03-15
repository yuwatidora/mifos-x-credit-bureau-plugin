package org.mifos.creditbureau.data.registration;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
public class CreditBureauData {

  @Builder.Default private final long id = 0;

  private final String creditBureauName;

  private final boolean active;

  private final String country;

  private final Set<String> registrationParamKeys;
}
