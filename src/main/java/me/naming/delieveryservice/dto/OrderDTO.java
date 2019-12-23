package me.naming.delieveryservice.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDTO {
  private int orderNum;
  private Date reqDate;
  private String orderStatus;
  private Date arrTime;
  private Date exArrTime;

  private String userId;
  private String deliveryId;
  private int departureCode;
  private String departureDetail;
  private int destinationCode;
  private String destinationDetail;

  private String productName;
}
