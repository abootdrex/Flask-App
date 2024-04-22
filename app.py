from flask import Flask, render_template, send_file, request

app = Flask(__name__)
app.config['SECRET_KEY'] = 'Thehobby'


@app.route('/')
def ho():       
        return render_template('intern.html')

@app.route('/ab')
def ab():        
        return render_template('ab.html')        


@app.route('/en')
def en():     
        return render_template('encap.html')     


@app.route('/poly')
def poly():     
        return render_template('poly.html')      

@app.route('/inheri')
def inheri():     
        return render_template('inheri.html') 


@app.route('/js')
def js():     
        return render_template('javascript.html') 

if __name__ == '__main__':
    app.run(debug=True)


