package io.sudhanshugupta.moneytransfer.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AccountResponse {

  private Long accountId;
  private String name;
  private String email;
  private BigDecimal balance;
  private Timestamp createdAt;
}
