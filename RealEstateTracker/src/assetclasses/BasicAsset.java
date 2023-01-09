package assetclasses;

public abstract class BasicAsset {
    SimulatedAsset simulation;
	double init_liabilities;
	double init_equity;
	double init_asset_value;
    
    
    public BasicAsset(double sum_liabilities, double sum_equity, double asset_value) {
        simulation = new SimulatedAsset();
        init_liabilities = sum_liabilities;
        init_equity = sum_equity;
        init_asset_value = asset_value;
    }
    
    protected abstract void run_simulation(int num_months);
    
    protected void set_init_sim_vals() {
        simulation.init_asset_value = init_asset_value;
        simulation.init_liabilities = init_liabilities;
	    simulation.init_equity = init_equity;
    }
    
	protected abstract void extend_simulation_revenue();
	protected abstract void extend_simulation_expenses();
    protected abstract void extend_simulation_liability_payments();
    protected abstract void extend_simulation_additional_investment();
    protected abstract void extend_simulation_capital_gains();
}
