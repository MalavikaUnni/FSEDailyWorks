import { CustompipePipe } from './custompipe.pipe';

// describe('CustompipePe', () => {
//   // it('create an instance', () => {
//   //   const pipe = new CustompipePipe();
//   //   expect(pipe).toBeTruthy();
//   // });
// });

function greetings()
{
  return 'Good Morning';
}

describe('Greeting Message',()=> {
  let expected='';
  beforeEach(()=> {
    expected='Good Morning';
  });

  afterEach(() => {
    expected='';
  });

  it('My GreetingMessage',()=> {
    expect(greetings()).toEqual(expected);
  });
  it('GoodBye',()=> {
    expect(greetings()).toEqual(expected);
  });
  it('')
});