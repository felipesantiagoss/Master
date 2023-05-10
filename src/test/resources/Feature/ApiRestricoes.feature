@tag
Feature: Servico de Restricoes a CPF


  @tag1
  Scenario: Realizar consulta de CPF
    Given que realize uma consulta no servico
    When passar um CPF valido "60094146012"
    Then valido o retorno da consulta
    

  