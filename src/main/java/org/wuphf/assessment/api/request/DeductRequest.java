package org.wuphf.assessment.api.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class DeductRequest {

    @NotNull
    private Long transactionId;
    @NotNull
    private Long playerId;
    @NotNull
    private Double amount;

    private String promoCode;

}
