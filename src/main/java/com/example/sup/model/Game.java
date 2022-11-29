package com.example.sup.model;

import com.example.sup.validation.ValidDivMax;
import com.example.sup.validation.ValidMin;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Game {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Game_GEN")
  @SequenceGenerator(name = "Game_GEN", sequenceName = "Game_SEQ")
  @Column(name = "id", nullable = false)
  private Long id;

  private boolean add;
  @ValidMin
  private int addLeftMin;
  private int addLeftMax;
  @ValidMin
  private int addRightMin;
  private int addRightMax;

  private boolean sub;
  @ValidMin
  private int subLeftMin;
  private int subLeftMax;
  @ValidMin
  private int subRightMin;
  private int subRightMax;

  private boolean mul;
  @ValidMin
  private int mulLeftMin;
  private int mulLeftMax;
  @ValidMin
  private int mulRightMin;
  private int mulRightMax;

  private boolean div;
  @ValidMin
  private int divLeftMin;
  private int divLeftMax;
  @ValidMin
  private int divRightMin;
  @ValidDivMax
  private int divRightMax;
}
