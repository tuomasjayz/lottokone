# Lottokone

Yksinkertainen web-sovellus lottonumeroiden tarkistamiseen.

## Ominaisuudet

- Mahdollisuus syöttää 1-5 lottoriviä
- Jokaiseen riviin 7 numeroa väliltä 1-40
- Kaikki rivit tarkistetaan samoja arvottuja numeroita vastaan
- Tulokset tallennetaan tietokantaan
- Näyttää jokaiselle riville:
  - Käyttäjän valitsemat numerot
  - Arvotut lottonumerot
  - Oikeiden numeroiden määrän

## Käynnistäminen

1. Kloonaa repositorio
3. Käynnistä sovellus komennolla: mvn spring-boot:run
4. Avaa selaimessa osoite: `http://localhost:8080`
5. Tietokantaan pääsee osoitteessa `http://localhost:8080/h2-console`
jdbc url: jdbc:h2:mem:testdb
username: sa
salasanaa ei tarvita

## Teknologiat

- Spring Boot
- H2-tietokanta
- Thymeleaf
- HTML, CSS, JavaScript

## Kehitysympäristö

- Java 17
- Maven
- Spring Boot 3.2.3