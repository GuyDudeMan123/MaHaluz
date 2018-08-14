package com.main;
import org.hibernate.Session;

import com.hibernate.HibernateUtils;
public class Populate_DB {

	public static void main(String[] args) {
		
		  //REBOOT DATA
		  Session session = HibernateUtils.getSessionFactory().getCurrentSession();
		session.getTransaction().begin();
		Employee admin = new Employee("admin", "מנהל מערכת", " ");
		admin.setPassword("admin102030");
		session.persist(admin);
		session.persist(new Employee("24011", "רותי", "ששואשוילי"));
		session.persist(new Employee("24026", "ענבל", "ששון"));
		session.persist(new Employee("24058", "סמדר", "אפנזר"));
		session.persist(new Employee("24055", "נירה", "תורג'מן"));
		session.persist(new Employee("24078", "קטרין", "מודחי"));
		session.persist(new Employee("24115", "חן", "גולוב"));
		session.persist(new Employee("24121", "לימור", "סולמי"));
		session.persist(new Employee("24015", "שניר", "גולן"));
		session.persist(new Employee("24027", "רנה", "לוין"));
		session.persist(new Employee("24033", "ענת", "שמיר"));
		session.persist(new Employee("24036", "שירין", "דכה"));
		session.persist(new Employee("24068", "מור", "רווח"));
		session.persist(new Employee("24050", "סיון", "כהן"));
		session.persist(new Employee("24006", "שרון", "נסימי"));
		session.persist(new Employee("24008", "נירית", "רוש"));
		session.persist(new Employee("24037", "מיכל", "אלבז"));
		session.persist(new Employee("24002", "שרון", "גולדמן"));
		session.persist(new Employee("24017", "רביע", "מנסור"));
		session.persist(new Employee("24010", "שירן", "מגדל"));
		session.persist(new Employee("24086", "אוריה", "כהן"));
		session.persist(new Employee("24094", "דנה", "סלגייב"));
		session.persist(new Employee("24097", "אורלי", "אליאס"));
		session.persist(new Employee("24032", "מילנה", "רחמייב"));
		session.persist(new Employee("24020", "סוזי", "ביטון"));
		session.persist(new Employee("24044", "רחל", "טגניה"));
		session.persist(new Employee("24071", "אנני", "טקלה"));
		session.persist(new Employee("24047", "נטלי", "בולין"));
		session.persist(new Employee("24061", "שיר", "נתן"));
		session.persist(new Employee("24012", "איתי", "מייגרנס"));
		session.persist(new Employee("24016", "ספיר", "שמי"));
		session.persist(new Employee("24028", "מור", "לוי"));
		session.persist(new Employee("24022", "טליה", "אדלמן"));
		session.persist(new Employee("24039", "טל", "ארביב"));
		session.persist(new Employee("24060", "נעמי", "ברלן"));
		session.persist(new Employee("24059", "טל", "בנסימון"));
		session.persist(new Employee("24089", "זיוה", "פז בן דויד"));
		session.persist(new Employee("24084", "מירב", "אביטל"));
		session.persist(new Employee("24083", "ציפורה", "זוהר"));
		session.persist(new Employee("24035", "ריקי", "באבל"));
		session.persist(new Employee("24107", "מיתר", "סבח"));
		session.persist(new Employee("24108", "גל", "ברי"));
		session.persist(new Employee("24009", "אדווה", "איזרזר"));
		session.persist(new Employee("24029", "אלהאם", "וותד"));
		session.persist(new Employee("24070", "אורטל", "גואטה"));
		session.persist(new Employee("24072", "גלעד", "יוסף"));
		session.persist(new Employee("24003", "חביב", "תרזי"));
		session.persist(new Employee("24030", "מלי", "חנוכייב"));
		session.persist(new Employee("24001", "עופר", "טמיר"));
		session.persist(new Employee("24116", "גיא", "שרף"));
		session.persist(new Employee("24024", "עינבל", "סיאני"));
		session.persist(new Employee("24046", "שובל", "עובדיה"));
		session.persist(new Employee("24014", "מירי", "לביא"));
		session.getTransaction().commit();
	}

}
