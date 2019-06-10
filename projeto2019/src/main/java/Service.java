import java.awt.List;

public interface Service<E extends Identificavel> {

	void save(E e);

	void update(E e);

	void remove(E e);

	E getByID(long userId);

	List getAll();

	void save(Usuario user);

	void update(Usuario user);

	void remove(Usuario user);

	Identificavel getByID1(long userId);

}