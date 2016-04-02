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
package ar.edu.unrc.tdlearning.perceptron.interfaces;

import ar.edu.unrc.tdlearning.perceptron.learning.StateProbability;
import java.util.List;

/**
 *
 * @author lucia bressan, franco pellegrini, renzo bianchini
 */
public interface IProblemState extends IProblem {

    /**
     * Solo se necesita implementar para el modo de aprendizaje
     * TDLambdaLearningAfterstate
     * <p>
     * @param afterState estado intermedio que contiene las acciones
     *                   deterministicas tomadas hasta el momento.
     * <p>
     * @return lista de los estados a los que se pueden alcanzar luego de
     *         computar las acciones no deterministicas. Cada estado debe estar
     *         emparejado con la probabilidad de que estos estados ocurran
     */
    public List<StateProbability> listAllPossibleNextTurnStateFromAfterstate(IState afterState);

}