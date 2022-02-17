@db
Feature: :US1001 Kullanici Database'e baglanip bilgileri okuyabilir

  Scenario: TC01 kullanici databese baglanip istedigi bilgileri okuyabilmeli

    Given kullanici HMC veri tabanina baglanir
    #database'e baglanacagız
    And kullanici "tHOTELROOM" tablosundaki "Price" verilerini alir
    # @uery calıstıracagımızSELECT Price FROM tHOTELROOM
    And kullanici "Price" sutunundaki verileri okur
    #3.Adımda database sorgusu sonunda bize dondurulen bilgiyi nasil kullanabileceğimizi göreceğiz