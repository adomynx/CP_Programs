import csv 
filename = "a.csv"
fields = [] 
rows = [] 
with open(filename, 'r') as csvfile: 
	csvreader = csv.reader(csvfile) 
	fields = csvreader.next() 
  for row in csvreader: 
		rows.append(row) 
  print("Total no. of rows: %d"%(csvreader.line_num)) 
print('Field names are:' + ', '.join(field for field in fields)) 
print('\nFirst 5 rows are:\n') 
for row in rows[:5]: 
	# parsing each column of a row 
	for col in row: 
		print("%10s"%col), 
	print('\n') 
