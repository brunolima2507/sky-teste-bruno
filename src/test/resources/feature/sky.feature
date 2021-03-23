#language: pt
#Author: Bruno Lima

@Executa
Funcionalidade: Programação Sky
  Eu como usuario, quero validar programacao em tempo real

Contexto: Acessar o site

		Dado que eu acesse o site "https://www.sky.com.br/"

  Cenario: Validar programacao
    Quando listo os canais
    Entao valido o teste