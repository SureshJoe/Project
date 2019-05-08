package com.niitproject.DAO;

import java.util.List;

import com.niitproject.Sections.Category;

public interface CategoryDAO {
	public boolean addCategory(Category category);
	public boolean updateCategory(Category category);
	public boolean deleteCategory(Category category);
	public List<Category> getCategories();
    public Category getCategory(int categoryId);
}
