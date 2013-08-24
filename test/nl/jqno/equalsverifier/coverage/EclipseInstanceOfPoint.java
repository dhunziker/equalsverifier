package nl.jqno.equalsverifier.coverage;

import nl.jqno.equalsverifier.testhelpers.points.Color;

public final class EclipseInstanceOfPoint {
	private final int x;
	private final int y;
	private final Color color;

	public EclipseInstanceOfPoint(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof EclipseInstanceOfPoint)) {
			return false;
		}
		EclipseInstanceOfPoint other = (EclipseInstanceOfPoint) obj;
		if (color != other.color) {
			return false;
		}
		if (x != other.x) {
			return false;
		}
		if (y != other.y) {
			return false;
		}
		return true;
	}
}