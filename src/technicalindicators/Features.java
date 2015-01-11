package technicalindicators;

public class Features {
	static int TOTAL_FEATURES = 28;
	static double[] features = new double[TOTAL_FEATURES];
	static boolean compute = true;
	public double getFeature(Indicator i){
		return features[i.getValue()];
	}
	public double[] getSelectedFeatures(Indicator[] iList){
		double[] featureSubset = new double[iList.length];
		for(int i = 0; i < iList.length; i++){
			featureSubset[i] = features[iList[i].getValue()];
		}
		return featureSubset;
	}
	public double[] getAllFeatures(){
		return features;
	}
	public void recompute(){
		Computation c = new Computation(TradingIndex.DOW_JONES_INDUSTRIAL_AVERAGE);
		features = c.computeAll();
	}
}