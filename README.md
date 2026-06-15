# 🐾 Simulador de Bichinho Virtual

Um jogo interativo de console desenvolvido em **Java** para praticar os conceitos fundamentais de **Programação Orientada a Objetos (POO)**, como Classes, Objetos, Atributos, Métodos e Encapsulamento.

---

## 🎯 Objetivo do Jogo
O objetivo é cuidar do seu pet virtual e fazê-lo chegar até a **idade 50**. Você perde se o bichinho atingir níveis críticos de fome, cansaço ou tristeza.

---

## 🛠️ Funcionalidades e Regras

* **Status do Pet:** O bichinho possui indicadores de Fome, Felicidade, Cansaço e Idade.
* **Ações Disponíveis:**
  * `Alimentar`: Diminui a fome.
  * `Brincar`: Aumenta a felicidade, mas aumenta o cansaço.
  * `Descansar`: Permite escolher quantas horas o pet vai dormir (até 8h) para recuperar energia.
* **Passagem do Tempo:** A cada ação realizada, o tempo passa, aumentando a fome (+3), o cansaço (+10), a idade (+1) e diminuindo a felicidade (-3).

### ❌ Condições de Derrota:
* Fome chegar a **100**.
* Cansaço chegar a **100**.
* Felicidade chegar a **0**.

---

