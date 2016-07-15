package xyz.yluo.ruisiapp.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.TextView;

import xyz.yluo.ruisiapp.R;

/**
 * Created by free2 on 16-3-21.
 * 带小三角的textview
 */
public class ArrowTextView extends TextView {


    private int color = ContextCompat.getColor(getContext(), R.color.bluegrey50);
    private Paint paint = new Paint();
    private Path path = new Path();


    public ArrowTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public ArrowTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
    public ArrowTextView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        paint.setColor(color == 0 ? Color.RED : color);
        paint.setAntiAlias(true);


        float arrowInHeight = 10;
        canvas.drawRoundRect(0, arrowInHeight,getWidth(),getHeight(), 4, 4, paint);

        path.reset();
        path.setFillType(Path.FillType.EVEN_ODD);
        path.moveTo(80, 0);
        path.lineTo(68, arrowInHeight);
        path.lineTo(92, arrowInHeight);
        path.lineTo(80, 0);
        path.close();
        canvas.drawPath(path, paint);

        super.onDraw(canvas);

    }

}
