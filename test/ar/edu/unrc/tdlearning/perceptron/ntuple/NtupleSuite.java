/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unrc.tdlearning.perceptron.ntuple;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author lucy
 */
@RunWith( Suite.class )
@Suite.SuiteClasses( {ar.edu.unrc.tdlearning.perceptron.ntuple.ComplexNTupleComputationTest.class, ar.edu.unrc.tdlearning.perceptron.ntuple.NTupleSystemTest.class, ar.edu.unrc.tdlearning.perceptron.ntuple.SamplePointStateTest.class, ar.edu.unrc.tdlearning.perceptron.ntuple.elegibilitytrace.ElegibilitytraceSuite.class} )
public class NtupleSuite {

    /**
     *
     * @throws Exception
     */
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    /**
     *
     * @throws Exception
     */
    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     *
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
    }

}
