// Copyright (C) 2009-2023 Lemoine Automation Technologies
//
// SPDX-License-Identifier: EPL-2.0

package com.lemoinetechnologies.pulse.reports.extensions;

import org.eclipse.birt.core.data.DataType;
import org.eclipse.birt.data.aggregation.impl.AggrFunction;
import org.eclipse.birt.data.aggregation.impl.ParameterDefn;
import org.eclipse.birt.data.aggregation.impl.SupportedDataTypes;
import org.eclipse.birt.data.engine.api.aggregation.Accumulator;
import org.eclipse.birt.data.engine.api.aggregation.IParameterDefn;

public class LinearRegressionSlope extends AggrFunction {

	private static final int NUMBER_OF_PASSES = 2;

	public String getName() {
		return "LINEARREGSLOPE";
	}

	public IParameterDefn[] getParameterDefn() {
		// three parameters
		//return new boolean[] { true, true, true };
		return new IParameterDefn[] {new ParameterDefn("a","a",false,true,SupportedDataTypes.CALCULATABLE,"First parameter") , new ParameterDefn("b","b",false,true,SupportedDataTypes.CALCULATABLE,"Second parameter"), new ParameterDefn("c","c",false,true,SupportedDataTypes.CALCULATABLE,"Third parameter")};
	}

	public int getType() {
		return RUNNING_AGGR;
	}

	public Accumulator newAccumulator() {
		return new LinearRegressionSlopeAccumulator();
	}

	public int getNumberOfPasses() {
		return NUMBER_OF_PASSES;
	}

  public int getDataType() {
		return DataType.DOUBLE_TYPE;
  }

  public String getDescription() {
	  return "LinearRegressionSlope";
  }

  public String getDisplayName() {
	  return "LinearRegressionSlope";
  }
}
