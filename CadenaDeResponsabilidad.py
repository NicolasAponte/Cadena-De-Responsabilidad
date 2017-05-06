
class Event:
  def __init__( self, name ):
    self.name = name


class Handler:
  
  def __init__( self, successor = None ):
    self.__successor = successor

  def Handle( self, event ):
    handler = 'Handle_' + event.name

    
    if hasattr( self, handler ):
      method = getattr( self, handler )
      method( event )

    
    elif self.__successor:
      self.__successor.Handle( event )

   
    elif hasattr( self, 'HandleDefault' ):
      self.HandleDefault( event )  


class EndOfChain( Handler ):
  def Handle_close( self, event ):
    print ('EndOfChain: ' + event.name)
  def HandleDefault( self, event ):
    print ('Default: ' + event.name)
        

class MiddleOfChain( Handler ):
  def Handle_do( self, event ):
    print ('MiddleOfChain: ' + event.name)


class FirstOfChain( Handler ):
  def Handle_action( self, event ):
    print ('FirstChain: ' + event.name)




end = EndOfChain()
middle = MiddleOfChain(end)
first = FirstOfChain(middle)

doEvent = Event('do')
actionEvent = Event('action')
closeEvent = Event('close')
nilEvent = Event('nil')

print ('Should print FirstOfChain: action')
first.Handle(actionEvent)

print ('Should print MiddleOfChain: do')
first.Handle(doEvent)

print ('Should print EndOfChain: close')
first.Handle(closeEvent)

print ('Should print Default nil')
first.Handle(nilEvent)
