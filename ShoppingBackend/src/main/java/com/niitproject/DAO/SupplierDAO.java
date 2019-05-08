package com.niitproject.DAO;

import java.util.List;

import com.niitproject.Sections.Supplier;

public interface SupplierDAO {
	public boolean addSupplier(Supplier supplier);
	public boolean updateSupplier(Supplier supplier);
	public boolean deleteSupplier(Supplier supplier);
	public List<Supplier> getSuppliers();
    public Supplier getSupplier(int supplierId);
}
