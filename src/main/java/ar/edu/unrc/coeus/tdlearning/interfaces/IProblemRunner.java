/*
 * Copyright (C) 2016  Lucia Bressan <lucyluz333@gmial.com>,
 *                     Franco Pellegrini <francogpellegrini@gmail.com>,
 *                     Renzo Bianchini <renzobianchini85@gmail.com
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ar.edu.unrc.coeus.tdlearning.interfaces;

import java.util.List;

/**
 * Debe ser extendido por las clases que pueden hacer uso de los algoritmos provistos en esta librería con el objetivo de hacer simulaciones una vez
 * entrenada la red neuronal.
 *
 * @author lucia bressan, franco pellegrini, renzo bianchini
 */
public
interface IProblemRunner {

    /**
     * Calcula el estado intermedio del turno, que es el estado al que se llega inmediatamente luego de aplicar la acción determinística {@code
     * action}, pero antes de aplicar las acciones estocásticas. Tras computar el afterState, se debe almacenar la recompensa parcial obtenida
     * dentro del {@code IState} retornado para ser utilizado en diferentes algoritmos.
     *
     * @param turnInitialState estado inicial (no se debe modificar, hay que retornar un nuevo objeto)
     * @param action           acción determinística para aplicar
     *
     * @return nuevo estado intermedio determinístico resultante de aplicar la acción {@code action} al estado {@code turnInitialState}, con su
     * recompensa parcial, para ser utilizado en el cálculo acumulativo de TDLearning
     */
    IState computeAfterState(
            final IState turnInitialState,
            final IAction action
    );

    /**
     * Calcula una representación numérica de la salida de la red neuronal. Este valor es utilizado para comparar diferentes {@code IState} y elegir
     * el mejor. Mientras mas grande el valor, mas importante se considerará el {@code IState}.
     *
     * @param output salida de la red neuronal desnormalizada.
     * @return un valor representativo que interpreta la salida de la red neuronal desde el punto de vista del {@code player}
     */
    Double computeNumericRepresentationFor(
            final Object[] output
    );

    /**
     * Desnormaliza el valor {@code value} que es el resultado obtenido en una de las neuronas de salida. Se asume que las neuronas de la capa de
     * salida utilizan la misma función de normalización.
     *
     * @param value resultado de una neurona de salida, tras evaluar la red neuronal.
     *
     * @return {@code value} desnormalizado.
     */
    double deNormalizeValueFromPerceptronOutput( final Object value );

    /**
     * Evaluación realizada por la red neuronal sobre {@code state}.
     *
     * @param state estado intermedio si se utiliza afterState, o estado inicial del turno en caso contrario.
     *
     * @return predicción realizada por la red neuronal, normalizada (si es que la función de activación fue normalizada).
     */
    Object[] evaluateStateWithPerceptron( final IState state );

    /**
     * Lista todas las posibles acciones validas aplicables al estado {@code turnInitialState}.
     *
     * @param turnInitialState estado del problema sobre el cual hacer cálculos.
     *
     * @return una lista de todas las acciones validas que se pueden aplicar al estado {@code turnInitialState}. Debe ser una estructura eficiente de
     * recorrer.
     */
    List< IAction > listAllPossibleActions(
            final IState turnInitialState
    );

}
