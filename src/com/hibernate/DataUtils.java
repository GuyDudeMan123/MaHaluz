package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.main.Employee;
import com.main.Shifts;

public class DataUtils {
	private static final SessionFactory factory = HibernateUtils.getSessionFactory();

	public DataUtils() {
		super();
	}

	@SuppressWarnings("unchecked")
	public static boolean confirmLogin(String employee_id, String password) {
		boolean success = false;
		Session session = factory.openSession();
		session.beginTransaction();
		String sql = "select e.password from " + Employee.class.getName() + " e where e.employee_id = :empId";
		try {
			Query<String> query = session.createQuery(sql);
			query.setParameter("empId", employee_id);
			String result = query.getSingleResult();
			if (result != null && result.equals(password))
				success = true;
		} catch (Exception e) {
			if (e.getMessage().equals("No entity found for query"))
				System.out
						.println("WARN: confirmLogin no Employee found for id: " + employee_id + " pass: " + password);
			else
				e.printStackTrace();
		} finally {
			session.close();
		}
		return success;
	}

	@SuppressWarnings("unchecked")
	public static Employee getEmployee(String id) {
		Employee emp = null;
		Session session = factory.openSession();
		session.beginTransaction();
		try {
			String sql = "from " + Employee.class.getName() + " e where e.employee_id = :empId";
			Query<Employee> query = session.createQuery(sql);
			query.setParameter("empId", id);
			List<Employee> emps = query.getResultList();
			if (!emps.isEmpty())
				emp = emps.get(0);
		} catch (Exception e) {
			if (e.getMessage().equals("No entity found for query"))
				System.out.println("WARN: getEmployee no Employee found for id: " + id);
			else
				e.printStackTrace();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return emp;
	}

	public static boolean removeEmployee(String id) {
		boolean success = false;
		Employee emp = getEmployee(id);
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			if (emp != null) {
				session.delete(emp);
				t.commit();
				success = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			if (t != null)
				t.rollback();
		} finally {
			session.close();
		}
		return success;

	}

	public static boolean addEmployee(Employee newEmp) {
		boolean success = false;
		Employee tmp = getEmployee(newEmp.getEmployee_id());
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			if (tmp == null) {
				session.persist(newEmp);
				t.commit();
				success = true;
			}
		} catch (Exception e) {
			if (t != null)
				t.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return success;
	}

	public static boolean addShifts(Shifts shifts) {
		boolean success = false;
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			session.persist(shifts);
			t.commit();
			success = true;
		} catch (Exception e) {
			if (t != null)
				t.rollback();
			e.printStackTrace();
		} finally {
		session.close();
		}
		return success;
	}

	public void shutdown() {
		factory.close();
	}
}