#Author: arthurfernandescorrea@gmail.com

@regressivos
Feature: Contratação de seguro de carro
 Como usuario do app
 Quero informar os dados 
 Para contratação de um seguro de carro
 
 Background: acessar a tela de contratação de Automobile
 Given que esteja na tela de Automobile
 
 @Positivo
 Scenario: Solicitação valida
 When preencher corretamente todos os campos da aba de VehicleData
 And preencher corretamente todos os campos da aba de InsurantData
 And preencher corretamente todos os campos da aba de ProductData
 And selecionar a opção de preço
 And preencher corretamente os dados de contratante e enviar orçamento por email
 Then validar alerta de envio
