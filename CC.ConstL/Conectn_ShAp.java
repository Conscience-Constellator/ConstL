package CC.ConstL;

/*Ubiq*/
import		  CC.COd.Finishd;
import		  CC.COd.Lin_DclAr;
import		  CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;

public abstract class Conectn_ShAp
{
	public abstract Path2D.Double Draw(Graphics2D Graphcs,
		Point2D A,
		Point2D B,
		double n,
		boolean fill);

	public static final Conectn_ShAp Dr=new Conectn_ShAp()
	{
		private static final double EPS=1e-9;

		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			public Path2D.Double Draw(Graphics2D Graphcs,
			Point2D A,
			Point2D B,
			double n,
			boolean fill)
		{
				/**
				 * Compute base-corners and draw a triangle with apex A and base centered at B.
				 *
				 * @param g     Graphics2D to draw on (may be null if only points are needed)
				 * @param A     apex point
				 * @param B     base center point
				 * @param n     half-length of the base (distance from B to each base corner)
				 * @param fill  true to fill the triangle, false to stroke it
				 * @return      Path2D.Double of the triangle (closed)
				 */
					// direction from B to A
					double vx = A.getX() - B.getX();
					double vy = A.getY() - B.getY();
					double len = Math.hypot(vx, vy);

					// fallback direction if A==B
					if (len < EPS) {
						vx = 0;
						vy = -1;
						len = 1;
					}

					// unit perpendicular to (vx,vy): (-vy, vx)/len
					double px = -vy / len;
					double py =  vx / len;

					// base corners = B ± n * perp
					double bx1 = B.getX() + px * n;
					double by1 = B.getY() + py * n;
					double bx2 = B.getX() - px * n;
					double by2 = B.getY() - py * n;

					Path2D.Double tri = new Path2D.Double();
					tri.moveTo(A.getX(), A.getY());
					tri.lineTo(bx1, by1);
					tri.lineTo(bx2, by2);
					tri.closePath();

					if(Graphcs!=null)
					{
						if (fill) Graphcs.fill(tri);
						else Graphcs.draw(tri);
					}

					return tri;
				}

				/**
				 * Utility variant that returns the three corner points [A, base1, base2].
				 */
				public static Point2D.Double[] trianglePoints(Point2D A, Point2D B, double n) {
					double vx = A.getX() - B.getX();
					double vy = A.getY() - B.getY();
					double len = Math.hypot(vx, vy);
					if (len < EPS) { vx = 0; vy = -1; len = 1; }
					double px = -vy / len;
					double py =  vx / len;
					Point2D.Double p1 = new Point2D.Double(A.getX(), A.getY());
					Point2D.Double p2 = new Point2D.Double(B.getX() + px * n, B.getY() + py * n);
					Point2D.Double p3 = new Point2D.Double(B.getX() - px * n, B.getY() - py * n);
					return new Point2D.Double[] { p1, p2, p3 };
				}

	};
}