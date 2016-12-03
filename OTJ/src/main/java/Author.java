
public class Author {

	public String authorName;
	public int age;

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Author(String aAuthorName, int aAge) {
		this.authorName = aAuthorName;
		this.age = aAge;
	}

}
