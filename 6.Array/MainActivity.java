 public class MainActivity extends Activity {

        BezierView mBezierView

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main)

            mBezierView = (BezierView) findViewById(R.id.bezier);
        }

        public void start(View view) {
            mBezierView.start();
        }

        public void stop(View view) {
            mBezierView.stop();
        }

        public void add(View view) {
            mBezierView.addPoint();
        }

        public void del(View view) {
            mBezierView.delPoint();
        }

    }
