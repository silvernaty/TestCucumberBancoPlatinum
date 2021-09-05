Feature: Realizacion de casos ingresando rut, nombre de usuario y contraseña
Scenario: verificacion de ingreso de sesion

Given Abrir Chrome
When ingresa rut "user" y username "user"
And ingresa password "user"
Then inicia sesion