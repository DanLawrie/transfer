package edu.monmouth.employee;

public class PieceEmployee implements Employee{
	private int ratePerPiece;
	private int piecesMade;
	
	public PieceEmployee(int ratePerPiece) {
		this.ratePerPiece = ratePerPiece;
	}

	public int getMonthlyPay(){
		return piecesMade*ratePerPiece;
	}

	public void setPiecesMade(int piecesMade) {
		this.piecesMade = piecesMade;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PieceEmployee other = (PieceEmployee) obj;
		if (piecesMade != other.piecesMade)
			return false;
		if (ratePerPiece != other.ratePerPiece)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PieceEmployee, ratePerPiece=" + ratePerPiece + ", piecesMade=" + piecesMade;
	}
	
	
}
