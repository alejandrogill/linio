# encoding: utf-8
Feature: Carrito de compras de linio
  
  I as user of the page
  I want to be able to validate the linio shopping cart
  to be able to sell several items in a single sale
  
  Scenario Outline: Seleccionar un articulo
    Given that the user is on the linio page
    When he adds the item <product> to the cart
    Then he will be able to see the article <product> entered

Examples:
|product|
|Impresora|
