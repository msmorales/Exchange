PKG_WS_FXF.PRC_FD_VALIDAR_SALDO(
  VARCHAR ${headers.pMoviAuxiliar},
  VARCHAR ${headers.pMoviCias},
  VARCHAR ${headers.pMoviCiasOrig},
  VARCHAR ${headers.pMoviCuenta},
  VARCHAR ${headers.pMoviDescripcion},
  VARCHAR ${headers.pMoviFecha},
  VARCHAR ${headers.pMoviFpag},
  VARCHAR ${headers.pMoviNumero},
  VARCHAR ${headers.pMoviOficina},
  VARCHAR ${headers.pMoviOrpaVigencia},
  VARCHAR ${headers.pMoviUsuaCrea},
  VARCHAR ${headers.pMoviValor},
  OUT INTEGER rActNeg,
  OUT INTEGER rNegComp,
  OUT INTEGER rNroComp,
  OUT INTEGER vActRta
)