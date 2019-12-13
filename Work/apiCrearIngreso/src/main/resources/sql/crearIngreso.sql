PKG_WS_FXF.PRC_FD_CREA_INGRESO(
  VARCHAR ${headers.pMoviApliOrig},
  VARCHAR ${headers.pMoviCias},
  VARCHAR ${headers.pMoviCiasOrig},
  VARCHAR ${headers.pMoviOficina},
  VARCHAR ${headers.pMoviNumero},
  VARCHAR ${headers.pMoviOrpaVigencia},
  VARCHAR ${headers.pMoviAuxiliar},
  VARCHAR ${headers.pMoviFpag},
  VARCHAR ${headers.pMoviDescripcion},
  VARCHAR ${headers.pMoviUsuaCrea},
  DATE ${headers.pMoviFecha},
  VARCHAR ${headers.pMoviCuenta},
  DECIMAL ${headers.pMoviValor},
  OUT VARCHAR rActNeg,
  OUT VARCHAR rNegComp,
  OUT VARCHAR rNroComp,
  OUT VARCHAR vActRta
)