package adapter;

public class NewSystem extends OldSystem implements Target {

	@Override
	public void newMethod() {
		oldMethod();

	}
}