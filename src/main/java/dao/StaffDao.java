package dao;

import models.Coarses;
import models.Staff;

import java.util.List;

public interface StaffDao {

    // LIST
    List<Staff> getAll();

    // CREATE
    void add(Staff staff);
    void addStaffToCoarse(Staff staff, Coarses coarses);

    // READ
    Staff findById(int id);

    // UPDATE
    void update(String name, String ekNumber,int coarseid);

    // DELETE
    void deleteById(int id);

    void clearAllStaff();
}