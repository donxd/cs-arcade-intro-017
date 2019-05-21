int arrayChange(int[] inputArray) {
    int numeroCambiosTotales = 0;
    int numeroCambios;
    for ( int i = 1; i < inputArray.length; i++ ){
        if ( !valorNumeroAceptable( inputArray, i ) ){
            numeroCambios = realizaCambios( inputArray, i );
            numeroCambiosTotales += numeroCambios;
        }
    }

    return numeroCambiosTotales;
}

boolean valorNumeroAceptable ( int [] entrada , int posicion ){
    return entrada[ posicion ] > entrada[ posicion - 1 ];
}

int realizaCambios ( int [] entrada, int posicion ){
    int numeroLimite = entrada[ posicion -1 ] + 1;
    int numeroPosicion = entrada[ posicion ];

    int numeroCambios = numeroLimite - numeroPosicion;

    entrada[ posicion ] = numeroLimite;

    return numeroCambios;
}
