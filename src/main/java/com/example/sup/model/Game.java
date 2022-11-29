package com.example.sup.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Game {

  @Id
  long id;

  boolean add;
  int addLeftMin;
  int addLeftMax;
  int addRightMin;
  int addRigthMax;

  boolean sub;
  int subLeftMin;
  int subLeftMax;
  int subRightMin;
  int subRightMax;

  boolean mul;
  int mulLeftMin;
  int mulLeftMax;
  int mulRightMin;
  int mulRightMax;

  boolean div;
  int divLeftMin;
  int divLeftMax;
  int divRightMin;
  int divRightMax;
}
