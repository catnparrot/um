class Members
{
	// HashMap<K, V> �� <tel, Members ��ü> �� ����ϱ� ������,
	// Members DTO �� ȸ�� �ڵ��� ���� ����
	private String name;	//-- ȸ�� �̸�
	private int point;		//-- �ܾ�


	// ������
	Members(String name)
	{
		this.name = name;
	}

    // getter
	public String getName()
	{
		return name;
	}


	public int getPoint()
	{
		return point;
	}
	
	// setter
	public void setName(String name)
	{
		this.name = name;
	}


	public void setPoint(int point)
	{
		this.point = point;	
	}

}






	