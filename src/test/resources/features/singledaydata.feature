# language: es
@FeatureName:datosDeCasosDiarios
Característica: Datos de casos diarios
  Como centro de control de enfermedades (CDC)
  Deseo conocer las estadisticas de los casos diarios de COVID-19
  Para estudiar la tendencia diaria de la pandemia

  @ScenarioName: numeroDeCasosYMuertesParaUnSoloDia
  Escenario: Numero de casos y muertes para un solo dia
    Dado que como investigador del CDC deseo conocer los datos de la pandemia
    Cuando solicite la informacion de casos y muertes para el dia 2020-07-03
    Entonces obtendre las estadisticas del dia