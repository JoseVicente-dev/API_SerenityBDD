# API_SerenityBDD

# Plan de pruebas Screenplay SerenityBDD API

Se desea generar 1 escenario para el recurso [https://api.covidtracking.com/v2](https://api.covidtracking.com/v2) que permite conocer los casos diarios de COVID-19 en los EE.UU hasta el 7 de marzo de 2021.

# Alcance

• **Base**: [https://api.covidtracking.com/v2](https://api.covidtracking.com/v2)
• **Recurso**: /us/daily/[date-iso-format].json
El "[date-iso-format]" debe ser un valor de fecha que genera información.
• **Criterio de aceptación**:
a. Valide el código de respuesta http.
b. Valide respuesta del flugo de negocio.

**Fuera del alcance:** otros servicios del aplicativo. Otros escenarios fuera de los especificados en la estrategia de pruebas

# Estrategia de pruebas

Las pruebas se harán automatizadas usando el patron Screenplay con Serenity BDD

Se plantea realizar una petición GET para una fecha específica.

**Cobertura de pruebas:** se ejecutarán en navegador Google Chrome, usando el SO Windows 10.

**Estrategia de datos**: se especificará el día requerido en la prueba como el 7 de marzo de 2021 [ISO 2021-03-07]

### Escenario

```markdown
# language: es
@FeatureName:datosDeCasosDiarios
**Característica:** Datos de casos diarios
  **Como** centro de control de enfermedades (CDC)
  **Deseo** conocer las estadísticas de los casos diarios de COVID-19
  **Para** estudiar la tendencia diaria de la pandemia

 @ScenarioName: numeroDeCasosYMuertesParaUnSoloDia
 **Escenario**: Numero de casos y muertes para un solo dia
	**Dado** que como investigador del CDC deseo conocer los datos de la pandemia
  **Cuando** solicite la informacion de casos y muertes para el dia 2020-07-03
  **Entonces** obtendre las estadisticas del dia
```

# Otros tipos de pruebas

Se recomienda al equipo realizar las siguientes pruebas:

- Pruebas de Rendimiento
- Pruebas de Seguridad

# Requerimientos

Acceso a la rest api de prueba. Acceso a ambiente de desarrollo